package br.com.bsi.pi.ticketsbsi.resources;

import br.com.bsi.pi.ticketsbsi.entities.User;
import br.com.bsi.pi.ticketsbsi.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserResourceTest {

    private UserService service = Mockito.mock(UserService.class);

    private UserResource UserResource;

    @BeforeEach
    public void setup() {
        UserResource = new UserResource(service);
    }

    @Test
    void findAll() {

        Mockito.when(service.findAll()).thenReturn(new ArrayList<>());

        var result = service.findAll();

        Assertions.assertNotNull(result);

    }

    @Test
    void findById() {

        final Long l = 1L;

        User u = Mockito.mock(User.class);

        Mockito.when(service.findById(l)).thenReturn(u);

        var result = service.findById(l);

        Assertions.assertNotNull(result);

    }
}
