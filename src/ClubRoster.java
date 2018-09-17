public class ClubRoster {
    public final int MAX_CLUBS = 30;
    private int numClubs;
    private Club[] clubRoster;

    public int getNumClubs() {
        return numClubs;
    }

    public ClubRoster() {
        this.clubRoster = new Club[MAX_CLUBS];
        numClubs = 0;
    }

    public ClubRoster(int maxClubs) {
        this.clubRoster = new Club[maxClubs];
        numClubs = 0;
    }

    public boolean addClub(Club c) {
        if (numClubs == clubRoster.length) {
            return false;
        } else {
            clubRoster[numClubs] = c;
            numClubs++;
            return true;
        }
    }

    public boolean removeClub(Club c) {
        //Find club
        for (int i = 0; i < numClubs; i++) {

            if (clubRoster[i].equals(c)) {
                //Shift array to remove club
                for (int j = i; j + 1 < numClubs; j++) {
                    clubRoster[j] = clubRoster[j + 1];
                }

                numClubs--;
                return true;

            }
        }
        return false;
    }

    //Get club by name
    public Club getClub(String name) {
        for (int i = 0; i < numClubs; i++) {
            if (clubRoster[i].getClubName().toLowerCase().trim().equals(name.toLowerCase().trim())) {
                return clubRoster[i];
            }
        }
        return null;
    }


    public void displayClubs() {
        for (int i = 0; i < numClubs; i++) {
            System.out.println(clubRoster[i].getClubName());
        }
    }
}
