package code.persistence.dao;

import code.Party;
import javax.inject.Named;

import javax.enterprise.context.Dependent;
import java.io.Serializable;

@Named
@Dependent
public class PartyDaoImpl extends AbstractDao<Party> implements PartyDao, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Party> getEntityClass() {
        return Party.class;
    }

}
