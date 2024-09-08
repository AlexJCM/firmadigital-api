package ec.gob.firmadigital.api;

/**
 * Especificación de constantes globales.
 *
 * @author ajcm
 */
public final class BaseConstants {

    private BaseConstants() {
    }

    /**
     * Se utiliza localhost si el servicio web rest se encuentra en el mismo servidor donde
     * esta desplegado api rest. Si estan en servidores diferentes se deberá utilizar la url pública
     * correspondiente.
     * Por ejemplo:
     *      http://wsmobile.firmadigital.gob.ec:8080
     *      http://impws.firmadigital.gob.ec:8080
     */
    public static final String BASE_URL = "http://localhost:7776";

    public static final String SERVICE_CONTEXT = "/servicio";

}
