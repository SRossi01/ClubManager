public class ClubRosterQueue {
    public final int MAX_CLUBS = 30;
    private int numClubs;
    private Club[] clubRoster;

    public ClubRosterQueue() {
        this.clubRoster = new Club[MAX_CLUBS];
        numClubs = 0;
    }

    public ClubRosterQueue(int maxClubs) {
        this.clubRoster = new Club[maxClubs];
        numClubs = 0;
    }

    public int getNumClubs() {
        return numClubs;
    }

    public boolean add(Club c) {
        if (numClubs == clubRoster.length) {
            return false;
        } else {
            for (int i = numClubs; i > 0; i++) {
                clubRoster[i] = clubRoster[i - 1];
            }
            clubRoster[0] = c;
            numClubs++;
            return true;
        }
    }

    public Club remove() {

        if (numClubs == 0) {
            return null;
        }

        numClubs--;
        Club temp = clubRoster[numClubs];
        clubRoster[numClubs] = null;
        return temp;
    }


    public Club peek() {
        if (numClubs == 0) {
            return null;
        }
        return clubRoster[numClubs - 1];
    }


    public void displayClubs() {
        for (int i = 0; i < numClubs; i++) {
            System.out.println(clubRoster[i].getClubName());
        }
    }
}
