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

import com.vickee.restapp.model.AddFlights;
import com.vickee.restapp.repository.AddFlightsRepo;

@SpringBootTest
public class AddFlightsServiceImplTest {

    @Mock
    private AddFlightsRepo repo;

    @InjectMocks
    private AddFlightsServiceImpl service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddFlightDetailsSuccess() {
        AddFlights flight = new AddFlights();
        when(repo.save(flight)).thenReturn(flight);
        
        String result = service.addFlightDetails(flight);
        assertEquals("success", result);
    }

    @Test
    public void testAddFlightDetailsFailure() {
        String result = service.addFlightDetails(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllFlights() {
        AddFlights flight1 = new AddFlights();
        AddFlights flight2 = new AddFlights();
        List<AddFlights> flights = Arrays.asList(flight1, flight2);

        when(repo.findAll()).thenReturn(flights);

        List<AddFlights> result = service.getAllFlights();
        assertEquals(flights, result);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetByDestination() {
        String fromDest = "New York";
        String toDest = "Los Angeles";
        AddFlights flight1 = new AddFlights();
        AddFlights flight2 = new AddFlights();
        List<AddFlights> flights = Arrays.asList(flight1, flight2);

        when(repo.findByDestination(fromDest, toDest)).thenReturn(flights);

        List<AddFlights> result = service.getByDestination(fromDest, toDest);
        assertEquals(flights, result);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetAllPids() {
        List<Integer> pids = Arrays.asList(1, 2, 3);

        when(repo.fetchAllPids()).thenReturn(pids);

        List<Integer> result = service.getAllPids();
        assertEquals(pids, result);
        assertNotNull(result);
        assertEquals(3, result.size());
    }
}
