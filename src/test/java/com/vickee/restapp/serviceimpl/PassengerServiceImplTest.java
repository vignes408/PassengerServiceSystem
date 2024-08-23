package com.vickee.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Passenger;
import com.vickee.restapp.repository.PassengerRepo;

@SpringBootTest
public class PassengerServiceImplTest {

    @Mock
    private PassengerRepo repo;

    @InjectMocks
    private PassengerServiceImpl service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddPassengerSuccess() {
        Passenger passenger = new Passenger();
        when(repo.save(passenger)).thenReturn(passenger);
        
        String result = service.addPassenger(passenger);
        assertEquals("success", result);
    }

    @Test
    public void testAddPassengerFailure() {
        String result = service.addPassenger(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllEmployees() {
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();
        List<Passenger> passengers = Arrays.asList(passenger1, passenger2);

        when(repo.findAll()).thenReturn(passengers);

        List<Passenger> result = service.getAllEmployees();
        assertEquals(passengers, result);
        assertNotNull(result);
        assertEquals(2, result.size());
    }
}
