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
				<tx:selectOneChoice
					label="#{appBundle.addDevice_locationLabel}"
					tip="#{appBundle.addDevice_locationLabel_tip}"
					value="#{locations.locationValue}">
					<f:selectItems value="#{locations.locations}" />
				</tx:selectOneChoice>

				<tx:selectOneChoice
					label="#{appBundle.addDevice_typeLabel}"
					tip="#{appBundle.addDevice_typeLabel_tip}"
					value="#{locations.locationValue}">
					<f:selectItems value="#{locations.locations}" />
				</tx:selectOneChoice>

				<tc:button id="button" action="helloWorld"
					actionListener="#{addDevice_backing.click}"
					label="#{appBundle.addDevice_buttonAction}" />

			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
