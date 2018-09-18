public class ClubRosterStack {
    public final int MAX_CLUBS = 30;
    private int numClubs;
    private Club[] clubRoster;

    public ClubRosterStack() {
        this.clubRoster = new Club[MAX_CLUBS];
        numClubs = 0;
    }

    public ClubRosterStack(int maxClubs) {
        this.clubRoster = new Club[maxClubs];
        numClubs = 0;
    }

    public int getNumClubs() {
        return numClubs;
    }

    public boolean push(Club c) {
        if (numClubs == clubRoster.length) {
            return false;
        } else {
            clubRoster[numClubs] = c;
            numClubs++;
            return true;
        }
    }

    public Club pop() {

        if (numClubs == 0) {
            return null;
        }

        numClubs--;
        Club temp = clubRoster[numClubs];
        clubRoster[numClubs] = null;
        return temp;
    }


    public Club peek() {
        return clubRoster[numClubs - 1];
    }


    public void displayClubs() {
        for (int i = 0; i < numClubs; i++) {
            System.out.println(clubRoster[i].getClubName());
        }
    }
}
