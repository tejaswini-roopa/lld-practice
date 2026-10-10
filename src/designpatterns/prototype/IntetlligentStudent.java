package designpatterns.prototype;

public class IntetlligentStudent extends Student {
    int iq;
    public IntetlligentStudent(IntetlligentStudent other)
    {
        super(other);
        this.iq = other.iq;
    }
    public IntetlligentStudent copy(){
        IntetlligentStudent isCopy = (IntetlligentStudent) super.copy();
        isCopy.iq = 1800;
        return new IntetlligentStudent(this);
    }
}
