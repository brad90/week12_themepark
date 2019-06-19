package themePark;

import Visitor.Visitor;


public interface ISecurity {


    public Boolean isVisitorAllowedToUseService(Visitor visitor);

}
