package io.ao9.flow.api.album.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumEntity {

    private long id;
    private String albumId;
    private String userId;
    private String title;
    private String description;

}