public class Main {

    public static void main(String[] args) {
        Student[] investmentClubRoster = {new Student(10, "Bob", Membership.MEMBER),
                new Student(11, "Jim", Membership.PRESIDENT)};

        ClubRoster roster = new ClubRoster();
        roster.addClub(new Club("Investment Club", "We try to make money", "Gabe Toth"));
        roster.getClub("Investment Club").addStudentList(investmentClubRoster);
        roster.getClub("Investment Club").displayRoster();

    }
}
