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

		<tc:box label="#{appBundle.addDeviceConfirm_boxTitle}">
			<f:facet name="layout">
				<tc:gridLayout border="0" />
			</f:facet>
			<tc:panel>
				<f:facet name="layout">
					<tc:gridLayout columns="1*;1*" />
				</f:facet>
				<!-- device name -->
				<tc:label rendered="true" value="#{appBundle.addDevice_nameLabel}" />
				<tc:out value="#{addDevice_backing.deviceName}" />
				<!-- location -->
				<tc:label rendered="true" value="#{appBundle.addDevice_locationLabel}" />
				<tc:out value="#{addDevice_backing.locationValue}" />
				<!-- type -->
				<tc:label rendered="true" value="#{appBundle.addDevice_typeLabel}" />
				<tc:out value="#{addDevice_backing.deviceType}" />
				<!-- type -->
			   <tc:panel>
			     <f:facet name="layout">
			       <tc:gridLayout columns="2*;1*;1*"/>
			     </f:facet>
				<tc:label rendered="true" value="#{appBundle.addDevice_houseCodeLabel}" />
				<tc:out value="#{addDevice_backing.houseCode}" />
				<tc:out value="#{addDevice_backing.unitCode}" />
			   </tc:panel>

				<!-- revise or commit -->
				<tc:button label="#{appBundle.addDeviceConfirm_revise}" action="revise"/>
				<tc:button label="#{appBundle.addDeviceConfirm_confirm}" action="#{addDevice_backing.addDevice}" />
			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
