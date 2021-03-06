package com.example.rajesh.popularmovies.rest.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rajesh on 9/19/15.
 */
public class Movie implements Parcelable {
    @SerializedName("id")
    public int id;

    @SerializedName("overview")
    public String overview;

    @SerializedName("release_date")
    public String releaseDate;

    @SerializedName("poster_path")
    public String posterPath;

    @SerializedName("popularity")
    public float popularity;

    @SerializedName("title")
    public String title;

    @SerializedName("vote_average")
    public float voteAverage;

    @SerializedName("vote_count")
    public int voteCount;

    protected Movie(Parcel in) {
        id = in.readInt();
        overview = in.readString();
        releaseDate = in.readString();
        posterPath = in.readString();
        popularity = in.readFloat();
        title = in.readString();
        voteAverage = in.readFloat();
        voteCount = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(overview);
        dest.writeString(releaseDate);
        dest.writeString(posterPath);
        dest.writeFloat(popularity);
        dest.writeString(title);
        dest.writeFloat(voteAverage);
        dest.writeInt(voteCount);
    }
}
