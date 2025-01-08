public class Coordenada {
    private double latitude, longitude;

    public Coordenada(){}

    public Coordenada(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude(){return latitude;}
    public void setLatitude(double latitude){this.latitude = latitude;}

    public double getLongitude(){return longitude;}
    public void setLongitude(double longitude){this.longitude = longitude;}


    public String imprimeFicheiroTxt(){
        return latitude + "/" + longitude;
    }


    @Override
    public String toString() {
        return "Coordenada{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

