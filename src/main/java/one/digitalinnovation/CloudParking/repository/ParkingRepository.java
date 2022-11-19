package one.digitalinnovation.CloudParking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.CloudParking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
