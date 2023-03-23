package padroesprojeto.criacao;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CloneTest{
    @Test
    void testClone() throws CloneNotSupportedException{
        Clone clone = new Clone(143, "Shooter", "Miss All", new Planet("Kamino", "Abrion"));

        Clone clone1 = clone.clone();
        clone1.setSerialNumber(543);

        assertEquals("Clone{serialNumber=143, type='Shooter', shootSkills='Miss All', planet=Planet{name='Kamino', sector='Abrion'}}", clone.toString());
        assertEquals("Clone{serialNumber=543, type='Shooter', shootSkills='Miss All', planet=Planet{name='Kamino', sector='Abrion'}}", clone1.toString());
    }
}