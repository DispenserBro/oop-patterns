package event;

import event.observer.Observer;
import event.observer.impl.Subscriber;
import event.publisher.impl.JobSite;

public class JobSearch {
    public static void main(String[] args) {
        JobSite site = new JobSite();
        Observer ivan = new Subscriber("Ivan");
        Observer olga = new Subscriber("Olga");
        Observer aleksandr = new Subscriber("Aleksandr");

        String vac1 = "Janitor";
        String vac2 = "Junior Python dev";
        String vac3 = "Senior Java dev";

        site.addVacancy(vac1);
        site.addVacancy(vac2);

        site.addObserver(ivan);
        site.addObserver(olga);

        site.addVacancy(vac3);

        site.addObserver(aleksandr);

        site.removeVacancy(vac1);
    }
}
