package Test_Homework_2;

import Homework_2.Car;
import Homework_2.Motorcycle;
import Homework_2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;


    @BeforeEach
    void setUp() {
        car = new Car("Audi", "RS6", 2022);
        motorcycle = new Motorcycle("Honda", "Shadow", 2006);

    }

    @Test
    void testClass(){
        assert car instanceof Vehicle;
    }

    @Test
    void numWheelsCar(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void numWheelsMotorcycle(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testDriveMotorcycle(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void parkMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}