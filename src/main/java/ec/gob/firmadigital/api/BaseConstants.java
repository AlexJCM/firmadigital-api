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
     * Se utiliza localhost debido a que el servicio web rest se encuentra en el mismo servidor de
     * la api rest. En caso de que estén en servidores diferentes se deberá utilizar la url pública
     * correspondiente. Por ejemplo:
     *      https://ws.firmadigital.gob.ec
     *      http://impws.firmadigital.gob.ec:8080
     */
    public static final String BASE_URL = "http://localhost:7776";

    public static final String SERVICE_CONTEXT = "/servicio";

}
