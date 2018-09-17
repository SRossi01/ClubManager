public class Club {
    private String clubName;
    private String description;
    private String teacherSponsor;
    public final int MAX_ROSTER = 20;
    private int numStudents;
    Student[] roster;

    public String getClubName() {
        return this.clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacherSponsor() {
        return this.teacherSponsor;
    }

    public void setTeacherSponsor(String teacherSponsor) {
        this.teacherSponsor = teacherSponsor;
    }

    public int getNumStudents() {
        return this.numStudents;
    }

    public Club(String clubName, String description, String teacherSponsor) {
        this.clubName = clubName;
        this.description = description;
        this.teacherSponsor = teacherSponsor;
        this.roster = new Student[MAX_ROSTER];
        this.numStudents = 0;
    }

    public Club(String clubName, String description, String teacherSponsor, int maxRoster) {
        this.clubName = clubName;
        this.description = description;
        this.teacherSponsor = teacherSponsor;
        this.roster = new Student[maxRoster];
        numStudents = 0;
    }

    public boolean addStudent(Student s) {
        if (numStudents == roster.length) {
            return false;
        } else {
            roster[numStudents] = s;
            numStudents++;
            return true;
        }
    }

    public boolean addStudentList(Student[] list) {
        if (numStudents + list.length < this.roster.length) {
            for (Student s : list) {
                roster[numStudents] = s;
                numStudents++;
            }
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student s) {
        //Find Student
        for (int i = 0; i < numStudents; i++) {

            if (roster[i].equals(s)) {
                //Shift array to remove student
                for (int j = i; j + 1 < numStudents; j++) {
                    roster[j] = roster[j + 1];
                }

                numStudents--;
                return true;

            }
        }
        return false;
    }

    //Iterate through roster until name matches
    public Student getStudentByName(String studentName) {
        for (int i = 0; i < numStudents; i++) {
            if (roster[i].getName().toLowerCase().trim().equals(studentName.toLowerCase().trim())) {
                return roster[i];
            }
        }
        return null;
    }

    //Find students with leadership position
    public Student getStudentByLeadership(Membership status) {
        if (status != Membership.MEMBER) {
            for (int i = 0; i < numStudents; i++) {
                if (roster[i].getStatus().equals(status)) {
                    return roster[i];
                }
            }
        }
        return null;
    }

    public void displayRoster() {
        System.out.println(clubName + ": ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(roster[i].getName());
        }
    }


}
