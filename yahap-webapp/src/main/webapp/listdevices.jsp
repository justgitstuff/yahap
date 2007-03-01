<%@ taglib uri="http://myfaces.apache.org/tobago/component" prefix="tc"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib tagdir="/WEB-INF/tags/layout" prefix="layout"%>
<%@ taglib uri="http://myfaces.apache.org/tobago/extension" prefix="tx"%>
<f:view>
	<f:facet name="reload">
		<tc:reload frequency="5000" />
	</f:facet>

	<tc:loadBundle basename="webapp" var="appBundle" />
	<tc:page>

		<tc:box label="#{appBundle.listDevices_boxTitle}">
			<f:facet name="layout">
				<tc:gridLayout border="0" />
			</f:facet>
			<tc:panel>
				<f:facet name="layout">
					<tc:gridLayout columns="1*;1*" />
				</f:facet>

				<tc:button action="adddevice" label="#{appBundle.listDevices_gotoAddDevice}" />
			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
