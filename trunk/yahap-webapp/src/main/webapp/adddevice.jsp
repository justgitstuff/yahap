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
					<tc:gridLayout  border="0" />
				</f:facet>
				<tx:in
				 	value="#{addDevice_backing.deviceName}" required="true"
					label="#{appBundle.addDevice_nameLabel}"
					tip="#{appBundle.addDevice_nameLabel_tip}"
					/>
				<tx:selectOneChoice
					label="#{appBundle.addDevice_locationLabel}"
					tip="#{appBundle.addDevice_locationLabel_tip}"
					value="#{addDevice_backing.locationValue}">
					<f:selectItems value="#{locations}" />
				</tx:selectOneChoice>

				<tx:selectOneChoice
					label="#{appBundle.addDevice_typeLabel}"
					tip="#{appBundle.addDevice_typeLabel_tip}"
					value="#{addDevice_backing.deviceType}">
					<f:selectItems value="#{deviceTypes}" />
				</tx:selectOneChoice>

			   <tc:panel>
			     <f:facet name="layout">
			       <tc:gridLayout columns="2*;1*;1*"/>
			     </f:facet>
			     <tc:label rendered="true" value="#{appBundle.addDevice_houseCodeLabel}" 
			     tip="#{appBundle.addDevice_houseCodeLabel_tip}" for="houseCode"/>
			     <tc:selectOneChoice value="#{addDevice_backing.houseCode}"> 
					<f:selectItem itemLabel="A" itemValue="A"/>
				    <f:selectItem itemLabel="B" itemValue="B"/>
    				<f:selectItem itemLabel="C" itemValue="C"/>
			     </tc:selectOneChoice>
			     <tc:selectOneChoice value="#{addDevice_backing.unitCode}">
					<f:selectItem itemLabel="1" itemValue="1"/>
				    <f:selectItem itemLabel="2" itemValue="2"/>
    				<f:selectItem itemLabel="3" itemValue="3"/>
			     </tc:selectOneChoice>
			   </tc:panel>

				<tc:button action="deviceconfirm"
					label="#{appBundle.addDevice_buttonAction}" />
			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
