package com.spotify.tests;

import com.spotify.apis.PlaylistApi;
import com.spotify.pojos.Playlist;
import com.spotify.utils.DataLoader;
import com.spotify.utils.FakerUtils;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class PlaylistTests {

    public Playlist playlistBuilder(String playlistName, String playlistDescription, Boolean isPublic){
        return Playlist.builder()
                .name(playlistName)
                .description(playlistDescription).
                _public(isPublic)
                .build();
    }

    @Description("create playlist test")
    @Test(description = "Create a new spotify playlist..")
    public void create_A_Spotify_Playlist() {
        Playlist playlistRequest = playlistBuilder(FakerUtils.generateName(),FakerUtils.generateDescription(),false);

        Response response = PlaylistApi.post(playlistRequest);
        assertThat(response.getStatusCode(),equalTo(201));

        Playlist playlistResponse = response.as(Playlist.class);
        assertThat(playlistResponse.getName(), equalTo(playlistRequest.getName()));
        assertThat(playlistResponse.getDescription(), equalTo(playlistRequest.getDescription()));
        assertThat(playlistResponse.get_public(), equalTo(playlistRequest.get_public()));
    }

    @Test
    public void getPlaylist(){
        String playlistid = DataLoader.getInstance().getPlaylistid();

        Response response = PlaylistApi.get(playlistid);
        assertThat(response.getStatusCode(),equalTo(200));

        Playlist playlistResponse = response.as(Playlist.class);
        assertThat(playlistResponse.getName(), containsString("Playlist"));


    }
}
