package org.springframework.samples.mvc.audit;

import com.github.inspektr.common.spi.PrincipalResolver;
import org.aspectj.lang.JoinPoint;

/**
 * Inspektr's <code>PrincipalResolver</code> that resolves to an <i>anonymous</i> user
 *
 * @author Dmitriy Kopylenko
 */
public class AnonymousPrincipalResolver implements PrincipalResolver {

    @Override
    public String resolveFrom(JoinPoint joinPoint, Object o) {
        return PrincipalResolver.ANONYMOUS_USER;
    }

    @Override
    public String resolveFrom(JoinPoint joinPoint, Exception e) {
        return PrincipalResolver.ANONYMOUS_USER;
    }

    @Override
    public String resolve() {
        return PrincipalResolver.ANONYMOUS_USER;
    }
}
