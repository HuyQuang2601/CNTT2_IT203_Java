package Ex5;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        int cmp = Integer.compare(p1.getSeverity(), p2.getSeverity());
        if (cmp != 0) return cmp;

        cmp = Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
        if (cmp != 0) return cmp;

        return p1.getName().compareTo(p2.getName());
    }
}