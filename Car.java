import java.util.ArrayList;
import java.util.Date;

public class Car implements Comparable<Car> {

    String nazwa;
    Date dataproduckcji;

    public Car(String nazwa, Date dataproduckcji) {
        this.nazwa = nazwa;
        this.dataproduckcji = dataproduckcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataproduckcji() {
        return dataproduckcji;
    }

    public void setDataproduckcji(Date dataproduckcji) {
        this.dataproduckcji = dataproduckcji;
    }

    public int compareto(Car car) {
        return dataproduckcji.compareTo(car.dataproduckcji);
    }
    public String toString() {
        return "Car{" +
                "nazwa='" + nazwa + '\'' +
                ", dataproduckji=" + dataproduckcji + '}';
    }


    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
