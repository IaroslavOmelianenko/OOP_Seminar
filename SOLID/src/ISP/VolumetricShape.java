package ISP;

/***
 * interface Shape separated on 2 interfaces - FlatShape and VolumetricShape
 * we don't need volume() in flat shapes
 */
public interface VolumetricShape {

    double area();
    double volume();
}
