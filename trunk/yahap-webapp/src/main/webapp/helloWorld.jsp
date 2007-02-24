<%--
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
--%>
<%@ taglib uri="http://myfaces.apache.org/tobago/component" prefix="tc"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib tagdir="/WEB-INF/tags/layout" prefix="layout"%>
<%@ taglib uri="http://myfaces.apache.org/tobago/extension" prefix="tx"%>
<f:view>
	<tc:loadBundle basename="devices" var="devicesBundle" />
	<tc:page>
		<f:facet name="layout">
			<tc:gridLayout />
		</f:facet>
		<tc:out value="YO Hello World" />

		<tc:box label="#{devicesBundle.basic_sampleInputTitle}">
			<f:facet name="layout">
				<tc:gridLayout columns="1*;1*" border="0" />
			</f:facet>

			<tc:panel>
				<f:facet name="layout">
					<tc:gridLayout />
				</f:facet>
				<tx:in value="#{testBean_backing.basicInput}" required="true"
					label="#{devicesBundle.basic_textboxLabel}" tip="test"
					suggestMethod="#{testBean_backing.getInputSuggestItems}" />
				<tx:date value="#{testBean_backing.basicDate}"
					label="#{devicesBundle.basic_dateLabel}" required="true">
					<f:convertDateTime pattern="dd/MM/yyyy" />
					<tc:validateSubmittedValueLength maximum="10" />
				</tx:date>
				<tx:time label="#{devicesBundle.basic_timeLabel}"
					value="#{testBean_backing.basicTime}" />
				<tc:button id="button" action="helloWorld"
					actionListener="#{testBean_backing.click}"
					label="#{devicesBundle.basic_buttonAction}" />

			</tc:panel>
		</tc:box>
	</tc:page>
</f:view>
