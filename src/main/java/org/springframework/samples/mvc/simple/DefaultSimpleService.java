package org.springframework.samples.mvc.simple;

import com.github.inspektr.audit.annotation.Audit;

/**
 * For testing Inspektr
 *
 * @author Dmitriy Kopylenko
 */
public class DefaultSimpleService  implements SimpleService {

    @Override
    @Audit(
        action="SIMPLE_ACTION",
        actionResolverName="DEFAULT_ACTION_RESOLVER",
        resourceResolverName="DEFAULT_RESOURCE_RESOLVER_XX")
    public String getSomeStringValue() {
        return "Well, here is some simple value";
    }
}
