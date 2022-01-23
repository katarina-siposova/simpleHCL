package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.After;
import yajco.annotation.Before;
import yajco.annotation.Optional;
import yajco.annotation.Separator;
import java.util.List;


public class Tupple extends CollectionValue {

    private List<LiteralValue> items;

    public Tupple(@Before("[") @After("]") @Separator(",") List<LiteralValue> items) {
        this.items = items;
    }

    public List<LiteralValue> getItems() {
        return items;
    }

    public void setItems(List<LiteralValue> items) {
        this.items = items;
    }
}
