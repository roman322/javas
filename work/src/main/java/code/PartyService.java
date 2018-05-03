package code;

import code.persistence.dao.PartyDao;
import com.google.inject.Inject;

import javax.enterprise.context.SessionScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/parties")
@SessionScoped
public class PartyService implements Serializable {
    private static  long serialVersionUID = 1L;

    private static Map<Integer, Party> partyMap = new HashMap<>();

    @Inject
    private PartyDao partyDao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Party getParty(@PathParam("id") Integer id) {
        return partyDao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createParty( Party party) {
        partyDao.persist(party);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response deleteParty( @PathParam("id") Integer id) {
        partyDao.delete(id);
        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateParty( Party party) {
        partyDao.update(party);
        return Response.ok().build();
    }
}