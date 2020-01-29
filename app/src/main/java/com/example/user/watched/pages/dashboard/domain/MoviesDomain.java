package com.example.user.watched.pages.dashboard.domain;

import android.support.annotation.NonNull;

public class MoviesDomain {
    public final @NonNull String name;
    public final @NonNull String directory;
    public final @NonNull String star;

    public MoviesDomain(@NonNull String name,
                        @NonNull String directory,
                        @NonNull String star) {
        this.name = name;
        this.directory = directory;
        this.star = star;
    }
}
