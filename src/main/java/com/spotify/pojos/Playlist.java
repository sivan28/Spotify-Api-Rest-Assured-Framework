
package com.spotify.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Playlist.PlaylistBuilder.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Playlist {

    @JsonProperty("collaborative")
    private Boolean collaborative;
    @JsonProperty("description")
    private String description;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    @JsonProperty("followers")
    private Followers followers;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Object> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("primary_color")
    private Object primaryColor;
    @JsonProperty("public")
    private Boolean _public;
    @JsonProperty("snapshot_id")
    private String snapshotId;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    Playlist(Boolean collaborative, String description, ExternalUrls externalUrls, Followers followers, String href, String id, List<Object> images, String name, Owner owner, Object primaryColor, Boolean _public, String snapshotId, Tracks tracks, String type, String uri) {
        this.collaborative = collaborative;
        this.description = description;
        this.externalUrls = externalUrls;
        this.followers = followers;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.primaryColor = primaryColor;
        this._public = _public;
        this.snapshotId = snapshotId;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    public static PlaylistBuilder builder() {
        return new PlaylistBuilder();
    }

    public Boolean getCollaborative() {
        return this.collaborative;
    }

    public String getDescription() {
        return this.description;
    }

    public ExternalUrls getExternalUrls() {
        return this.externalUrls;
    }

    public Followers getFollowers() {
        return this.followers;
    }

    public String getHref() {
        return this.href;
    }

    public String getId() {
        return this.id;
    }

    public List<Object> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public Object getPrimaryColor() {
        return this.primaryColor;
    }

    public Boolean get_public() {
        return this._public;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public Tracks getTracks() {
        return this.tracks;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    @JsonProperty("collaborative")
    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    @JsonProperty("followers")
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("primary_color")
    public void setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
    }

    @JsonProperty("public")
    public void set_public(Boolean _public) {
        this._public = _public;
    }

    @JsonProperty("snapshot_id")
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
    public static class PlaylistBuilder {
        private Boolean collaborative;
        private String description;
        private ExternalUrls externalUrls;
        private Followers followers;
        private String href;
        private String id;
        private List<Object> images;
        private String name;
        private Owner owner;
        private Object primaryColor;
        private Boolean _public;
        private String snapshotId;
        private Tracks tracks;
        private String type;
        private String uri;

        PlaylistBuilder() {
        }

        @JsonProperty("collaborative")
        public PlaylistBuilder collaborative(Boolean collaborative) {
            this.collaborative = collaborative;
            return this;
        }

        @JsonProperty("description")
        public PlaylistBuilder description(String description) {
            this.description = description;
            return this;
        }

        @JsonProperty("external_urls")
        public PlaylistBuilder externalUrls(ExternalUrls externalUrls) {
            this.externalUrls = externalUrls;
            return this;
        }

        @JsonProperty("followers")
        public PlaylistBuilder followers(Followers followers) {
            this.followers = followers;
            return this;
        }

        @JsonProperty("href")
        public PlaylistBuilder href(String href) {
            this.href = href;
            return this;
        }

        @JsonProperty("id")
        public PlaylistBuilder id(String id) {
            this.id = id;
            return this;
        }

        @JsonProperty("images")
        public PlaylistBuilder images(List<Object> images) {
            this.images = images;
            return this;
        }

        @JsonProperty("name")
        public PlaylistBuilder name(String name) {
            this.name = name;
            return this;
        }

        @JsonProperty("owner")
        public PlaylistBuilder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        @JsonProperty("primary_color")
        public PlaylistBuilder primaryColor(Object primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        @JsonProperty("public")
        public PlaylistBuilder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        @JsonProperty("snapshot_id")
        public PlaylistBuilder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        @JsonProperty("tracks")
        public PlaylistBuilder tracks(Tracks tracks) {
            this.tracks = tracks;
            return this;
        }

        @JsonProperty("type")
        public PlaylistBuilder type(String type) {
            this.type = type;
            return this;
        }

        @JsonProperty("uri")
        public PlaylistBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public Playlist build() {
            return new Playlist(this.collaborative, this.description, this.externalUrls, this.followers, this.href, this.id, this.images, this.name, this.owner, this.primaryColor, this._public, this.snapshotId, this.tracks, this.type, this.uri);
        }

        public String toString() {
            return "Playlist.PlaylistBuilder(collaborative=" + this.collaborative + ", description=" + this.description + ", externalUrls=" + this.externalUrls + ", followers=" + this.followers + ", href=" + this.href + ", id=" + this.id + ", images=" + this.images + ", name=" + this.name + ", owner=" + this.owner + ", primaryColor=" + this.primaryColor + ", _public=" + this._public + ", snapshotId=" + this.snapshotId + ", tracks=" + this.tracks + ", type=" + this.type + ", uri=" + this.uri + ")";
        }
    }
}
