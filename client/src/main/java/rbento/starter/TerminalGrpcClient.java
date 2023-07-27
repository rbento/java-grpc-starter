
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.starter;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import rbento.api.v1.CommandRequest;
import rbento.api.v1.CommandResponse;
import rbento.api.v1.TerminalGrpc;

@Slf4j
public class TerminalGrpcClient {

    private ManagedChannel channel;
    private TerminalGrpc.TerminalBlockingStub stub;

    public TerminalGrpcClient(final String host, final int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        stub = TerminalGrpc.newBlockingStub(channel);
    }

    public CommandResponse executeCommand(CommandRequest request) {
        log.info("executeCommand: {}", request);
        try {
            return stub.executeCommand(request);
        } catch (StatusRuntimeException e) {
            log.error("Error", e);
            return CommandResponse.getDefaultInstance();
        }
    }
}
