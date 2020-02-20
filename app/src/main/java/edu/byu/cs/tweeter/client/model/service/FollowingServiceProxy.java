package edu.byu.cs.tweeter.client.model.service;

import edu.byu.cs.tweeter.model.service.FollowingService;
import edu.byu.cs.tweeter.model.service.request.FollowingRequest;
import edu.byu.cs.tweeter.client.net.ServerFacade;
import edu.byu.cs.tweeter.model.service.response.FollowingResponse;

/**
 * A remote-access proxy for accessing the 'following' service.
 */
public class FollowingServiceProxy implements FollowingService {

    private final ServerFacade serverFacade = new ServerFacade();

    @Override
    public FollowingResponse getFollowees(FollowingRequest request) {
        return serverFacade.getFollowees(request);
    }
}
