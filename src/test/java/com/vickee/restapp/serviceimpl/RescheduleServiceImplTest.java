package com.vickee.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Reschedule;
import com.vickee.restapp.repository.RescheduleRepo;

@SpringBootTest
public class RescheduleServiceImplTest {

    @Mock
    private RescheduleRepo repo;

    @InjectMocks
    private RescheduleServiceImpl service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddRescheduleSuccess() {
        Reschedule reschedule = new Reschedule();
        when(repo.save(reschedule)).thenReturn(reschedule);

        String result = service.addReshedule(reschedule);
        assertEquals("success", result);
    }

    @Test
    public void testAddRescheduleFailure() {
        String result = service.addReshedule(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllSchedule() {
        Reschedule reschedule1 = new Reschedule();
        Reschedule reschedule2 = new Reschedule();
        List<Reschedule> reschedules = Arrays.asList(reschedule1, reschedule2);

        when(repo.findAll()).thenReturn(reschedules);

        List<Reschedule> result = service.getAllSchedule();
        assertEquals(reschedules, result);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testApproveRequest() {
        int id = 1;
        Reschedule reschedule = new Reschedule();
        reschedule.setReid(id);
        reschedule.setStatus("pending");

        when(repo.findById(id)).thenReturn(Optional.of(reschedule));
        when(repo.save(reschedule)).thenReturn(reschedule);

        Reschedule result = service.approveRequest(id);
        assertEquals("approved", result.getStatus());
    }

    @Test
    public void testRejectRequest() {
        int id = 2;
        Reschedule reschedule = new Reschedule();
        reschedule.setReid(id);
        reschedule.setStatus("pending");

        when(repo.findById(id)).thenReturn(Optional.of(reschedule));
        when(repo.save(reschedule)).thenReturn(reschedule);

        Reschedule result = service.rejectRequest(id);
        assertEquals("rejected", result.getStatus());
    }

    @Test
    public void testApproveRequestNotFound() {
        int id = 3;

        when(repo.findById(id)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> service.approveRequest(id), "Request not found");
    }

    @Test
    public void testRejectRequestNotFound() {
        int id = 4;

        when(repo.findById(id)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> service.rejectRequest(id), "Request not found");
    }
}
