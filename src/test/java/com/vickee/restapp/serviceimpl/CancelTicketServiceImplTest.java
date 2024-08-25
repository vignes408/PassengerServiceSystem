//package com.vickee.restapp.serviceimpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.vickee.restapp.model.CancelTicket;
//import com.vickee.restapp.repository.CancelTicketRepo;
//
//@SpringBootTest
//public class CancelTicketServiceImplTest {
//
//    @Mock
//    private CancelTicketRepo repo;
//
//    @InjectMocks
//    private CancelTicketServiceImpl service;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testAddCancelTicketSuccess() {
//        CancelTicket cancelTicket = new CancelTicket();
//        when(repo.save(cancelTicket)).thenReturn(cancelTicket);
//
//        String result = service.addCancelTicket(cancelTicket);
//        assertEquals("success", result);
//    }
//
//    @Test
//    public void testAddCancelTicketFailure() {
//        String result = service.addCancelTicket(null);
//        assertEquals("failure", result);
//    }
//
//    @Test
//    public void testGetAllCancel() {
//        CancelTicket cancelTicket1 = new CancelTicket();
//        CancelTicket cancelTicket2 = new CancelTicket();
//        List<CancelTicket> cancelTickets = Arrays.asList(cancelTicket1, cancelTicket2);
//
//        when(repo.findAll()).thenReturn(cancelTickets);
//
//        List<CancelTicket> result = service.getAllCancel();
//        assertEquals(cancelTickets, result);
//        assertNotNull(result);
//        assertEquals(2, result.size());
//    }
//
//    @Test
//    public void testApproveRequest() {
//        int id = 1;
//        CancelTicket cancelTicket = new CancelTicket();
//        cancelTicket.setCancelid(id);
//        cancelTicket.setStatus("pending");
//
//        when(repo.findById(id)).thenReturn(Optional.of(cancelTicket));
//        when(repo.save(cancelTicket)).thenReturn(cancelTicket);
//
//        CancelTicket result = service.approveRequest(id);
//        assertEquals("approved", result.getStatus());
//    }
//
//    @Test
//    public void testRejectRequest() {
//        int id = 2;
//        CancelTicket cancelTicket = new CancelTicket();
//        cancelTicket.setCancelid(id);
//        cancelTicket.setStatus("pending");
//
//        when(repo.findById(id)).thenReturn(Optional.of(cancelTicket));
//        when(repo.save(cancelTicket)).thenReturn(cancelTicket);
//
//        CancelTicket result = service.rejectRequest(id);
//        assertEquals("rejected", result.getStatus());
//    }
//
//    @Test
//    public void testFetchId() {
//        int id = 3;
//        CancelTicket cancelTicket = new CancelTicket();
//        cancelTicket.setCancelid(id);
//
//        when(repo.findById(id)).thenReturn(Optional.of(cancelTicket));
//
//        CancelTicket result = service.fetchId(id);
//        assertEquals(id, result.getCancelid());
//    }
//
//    @Test
//    public void testFetchIdNotFound() {
//        int id = 4;
//
//        when(repo.findById(id)).thenReturn(Optional.empty());
//
//        assertThrows(RuntimeException.class, () -> service.fetchId(id), "Request not found");
//    }
//}
