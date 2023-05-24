package fr.eni.movielibrary.bo;

public class Review {
    private long id;
    private int grade;
    private String comment;
    private Movie movie;
    private Member member;

    public Review(long id, int grade, String comment) {
        this.id = id;
        this.grade = grade;
        this.comment = comment;
    }

    public Review() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getgrade() {
        return grade;
    }

    public void setgrade(int grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
