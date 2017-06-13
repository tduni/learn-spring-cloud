import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class PreFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(PreFilter.class)

    @Override
    String filterType() {
        return "pre"
    }

    @Override
    int filterOrder() {
        return 0
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest()
        logger.info("This is a pre filter: Send {} request to {}", request.getMethod(), request.getRequestURL().toString())

        HttpServletResponse response = RequestContext.getCurrentContext().getResponse()
        response.getOutputStream().print(", I am Kidal")
        response.flushBuffer()

        return null
    }
}