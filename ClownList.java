
import java.util.ArrayList;

/**
 * Created by Uma Wu on 2016/7/26.
 */

public class ClownList extends Clown {
    ArrayList<Clown> clownList;

    public ClownList() {
        clownList = new ArrayList<Clown>();
    }

    public void addClown() {
        Clown newClown = new Clown();
        this.clownList.add(newClown);
    }

    public void flip(int index) {
        if (this.clownList.size() <= 3) {
            System.out.println("Not enough clowns!");

        } else if (index - 1 < 0) {
            for (int num = index; num <= index + 1; num++) {
                this.clownList.get(num).isStanding = !this.clownList.get(num).isStanding;
            }
        } else if (index + 1 >= this.clownList.size()) {
            for (int num = index - 1; num <= index; num++) {
                this.clownList.get(num).isStanding = !this.clownList.get(num).isStanding;
            }
        } else {
            for (int num = index - 1; num <= index + 1; num++) {
                this.clownList.get(num).isStanding = !this.clownList.get(num).isStanding;
            }
        }
    }

    public boolean allStand() {
        boolean allstand = true;
        int ind = 0;

        while (allstand && ind < (clownList.size() - 1)) {
            allstand = clownList.get(ind).isStanding;
            ind++;
        }

        return allstand;
    }

    public void renderClown() {
        String clownLine = "";
        for (int ind = 0; ind < clownList.size(); ind++) {
            Clown clown = clownList.get(ind);
            if (clown.isStanding) {
                clownLine = clownLine + " X ";
            } else if (!clown.isStanding) {
                clownLine = clownLine + " O ";
            } else {
                System.out.println("How is this even possible?");
            }
        }
        System.out.println(clownLine);
    }

}
