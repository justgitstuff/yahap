<%@ taglib uri="http://myfaces.apache.org/tobago/component" prefix="tc"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib tagdir="/WEB-INF/tags/layout" prefix="layout"%>
<%@ taglib uri="http://myfaces.apache.org/tobago/extension" prefix="tx"%>
<f:view>
	<tc:loadBundle basename="webapp" var="appBundle" />
	<tc:page>
		<f:facet name="layout">
			<tc:gridLayout />
		</f:facet>

		<tc:box label="#{appBundle.addDevice_boxTitle}">
			<f:facet name="layout">
				<tc:gridLayout border="0" />
			</f:facet>

			<tc:panel>
				<f:facet name="layout">
					<tc:gridLayout border="0" />
				</f:facet>
				<tx:in value="#{addDevice_backing.deviceName}" required="true"
					label="#{appBundle.addDevice_nameLabel}"
					tip="#{appBundle.addDevice_nameLabel_tip}"
					suggestMethod="#{addDevice_backing.getInputSuggestItems}" />

				<tc:selectOneChoice
					label="#{appBundle.addDevice_locationLabel}"
					tip="#{appBundle.addDevice_locationLabel_tip}"
					value="#{yahapController.locationValue}">
					<f:selectItems value="#{yahapController.locations}" />
				</tc:selectOneChoice>


				<tc:button id="button" action="helloWorld"
					actionListener="#{addDevice_backing.click}"
					label="#{appBundle.addDevice_buttonAction}" />

			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
