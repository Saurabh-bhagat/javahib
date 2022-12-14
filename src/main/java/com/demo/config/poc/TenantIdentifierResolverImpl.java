package com.demo.config.poc;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class TenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	private static String DEFAULT_TENANT_ID = "tenant_1";

	@Override
	public String resolveCurrentTenantIdentifier() {
		String currentTenantId = TenantContext.getTenantId();
		return (currentTenantId != null) ? currentTenantId : DEFAULT_TENANT_ID;
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}
}