package methodOverriding_1.pojo;

public class CarParams {

    public int carId;
    public String carName;
    public String carModel;
    public String carColor;
    public String carPrice;
    public int carYear;
    public String carType;
    public String carFuelType;

    public CarParams(int carId, String carName, String carModel, String carColor, String carPrice, int carYear, String carType, String carFuelType){
        this.carId = carId;
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carYear = carYear;
        this.carType = carType;
        this.carFuelType = carFuelType;
    }
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarFuelType() {
        return carFuelType;
    }

    public void setCarFuelType(String carFuelType) {
        this.carFuelType = carFuelType;
    }

    @Override
    public String toString() {
        return "CarParams{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice=" + carPrice +
                ", carYear=" + carYear +
                ", carType='" + carType + '\'' +
                ", carFuelType='" + carFuelType + '\'' +
                '}';
    }


}
