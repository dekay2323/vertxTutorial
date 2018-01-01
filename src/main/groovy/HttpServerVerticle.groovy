import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.logging.Logger
import io.vertx.core.logging.LoggerFactory
import io.vertx.ext.web.Route

public class HttpServerVerticle extends AbstractVerticle {
    private static final Logger LOGGER = LoggerFactory.getLogger(this)
    
    public static final String CONFIG_HTTP_SERVER_PORT = 'http.server.port'
    public static final String CONFIG_WIKIDB_QUEUE = 'wikidb.queue'
    
    def wikiDbQueue = "wikidb.queue"
    
    @Override
    public void star(Future startFuture) throws Exception {
        wikiDbQueue = config().getString(CONFIG_WIKIDB_QUEUE, 'wikidb.queue')
        
        def server = vertx.createHttpServer()
        
        def router = Route.router(vertx)
    }
}