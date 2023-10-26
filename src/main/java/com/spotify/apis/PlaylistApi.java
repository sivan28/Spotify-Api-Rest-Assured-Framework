package com.spotify.apis;

import com.spotify.pojos.Playlist;
import com.spotify.utils.ConfigLoader;
import io.restassured.response.Response;

public class PlaylistApi {
    public static Response post(Playlist playlistRequest) {
        return RestApi.post(EndPoints.USERS+"/" + ConfigLoader.getInstance().getUserId() +EndPoints.PLAYLISTS, playlistRequest);
    }

    public static Response get(String playlistid) {
        return RestApi.get(EndPoints.PLAYLISTS + "/" + playlistid);
    }

}
