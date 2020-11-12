package domain;

import java.util.Date;

public class Xbox{
    private String name;
    private boolean exclusive;
    private Date releaseDate;
    private float gameRatingsScore;
    private float ranxRatingScore;
    private boolean backwardsCompatible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getGameRatingsScore() {
        return gameRatingsScore;
    }

    public void setGameRatingsScore(float gameRatingsScore) {
        this.gameRatingsScore = gameRatingsScore;
    }

    public float getRanxRatingScore() {
        return ranxRatingScore;
    }

    public void setRanxRatingScore(float ranxRatingScore) {
        this.ranxRatingScore = ranxRatingScore;
    }

    public boolean isBackwardsCompatible() {
        return backwardsCompatible;
    }

    public void setBackwardsCompatible(boolean backwardsCompatible) {
        this.backwardsCompatible = backwardsCompatible;
    }
}
