<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page2
    Created on : Dec 21, 2008, 1:52:37 PM
    Author     : Z000DG8C
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:tabSet id="tabSet1" selected="tab2" style="height: 886px; left: 240px; top: 0px; position: absolute; width: 814px">
                            <webuijsf:tab id="tab1" text="blanca2 (ssh)"/>
                            <webuijsf:tab id="tab2" text="blade1 (telnet)">
                                <webuijsf:panelLayout id="layoutPanel1" style="width: 100%; height: 128px;">
                                    <webuijsf:textArea columns="160" id="textArea1" rows="60"
                                        style="background-color: rgb(0, 0, 0); color: rgb(255, 255, 255); font-family: 'Courier New',Courier,monospace; left: 0px; top: 0px; position: absolute"
                                        text="login as: bhal&#xa;bhal@blrmcc05's password:&#xa;Last login: Fri Dec 19 12:22:10 2008 from 10.143.64.185&#xa;Sun Microsystems Inc.   SunOS 5.9       Generic May 2002&#xa;Authorized users only. All activity may be monitored and reported.&#xa;Sun Microsystems Inc.   SunOS 5.9       Generic May 2002&#xa;Authorized users only. All activity may be monitored and reported.&#xa;You have mail.&#xa;                                                  ###   #######&#xa; #####   #       #####   #    #   ####    ####   #   #  #&#xa; #    #  #       #    #  ##  ##  #    #  #    # #     # #&#xa; #####   #       #    #  # ## #  #       #      #     # ######&#xa; #    #  #       #####   #    #  #       #      #     #       #&#xa; #    #  #       #   #   #    #  #    #  #    #  #   #  #     #&#xa; #####   ######  #    #  #    #   ####    ####    ###    #####&#xa;&#xa;bhal@blrmcc05$ ls&#xa;FI_081219_191208_TSPYAR930100_TSPYSG930100_TSPVXG910100_PW_IMS  oemauto&#xa;OEMDescriptor.dtd                                               oemautologs&#xa;PoojaBhal                                                       openssh-3.9p1&#xa;SMAWsmb-SLES10-9.1A20-00.i686.tar.gz                            openssh-5.1p1.tar.gz&#xa;TEST                                                            pd_linux&#xa;analysis_tool_new                                               pd_linux.xml&#xa;analysis_tool_old                                               pd_linux_org.xml&#xa;cr_prevcare                                                     responsibilities&#xa;cr_smb                                                          simulate_tool&#xa;intpasmed                                                       view&#xa;intpasmed.tar                                                   views&#xa;bhal@blrmcc05$" valueChangeListenerExpression="#{Page2.textArea1_processValueChange}"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab id="tab3" text="blanca1 (ssh)">
                                <webuijsf:panelLayout id="layoutPanel5" style="height: 489px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label id="label1" style="position: absolute; left: 72px; top: 72px" text="Username"/>
                                    <webuijsf:textField id="textField1" style="left: 144px; top: 72px; position: absolute"/>
                                    <webuijsf:label id="label2" style="left: 72px; top: 120px; position: absolute" text="Password"/>
                                    <webuijsf:textField id="textField2" style="position: absolute; left: 144px; top: 120px"/>
                                    <webuijsf:button id="button1" style="left: 220px; top: 168px; position: absolute; width: 48px" text="Login"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                        </webuijsf:tabSet>
                        <webuijsf:accordion id="accordion1" style="height: 671px; left: 0px; top: 0px; position: absolute; width: 240px">
                            <webuijsf:accordionTab contentHeight="400px" id="accordionTab1" selected="true" title="Node List">
                                <webuijsf:panelLayout id="layoutPanel2" style="width: 128px; height: 128px;">
                                    <webuijsf:tree id="tree1" style="left: 0px; top: 0px; position: absolute; width: 214px" text="Tree">
                                        <webuijsf:treeNode expanded="true" id="treeNode1" text="TSP">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_FOLDER" id="image1"/>
                                            </f:facet>
                                            <webuijsf:treeNode id="treeNode2" text="blanca1">
                                                <f:facet name="image">
                                                    <webuijsf:image icon="TREE_DOCUMENT" id="image2"/>
                                                </f:facet>
                                            </webuijsf:treeNode>
                                            <webuijsf:treeNode id="treeNode3" text="blanca2">
                                                <f:facet name="image">
                                                    <webuijsf:image icon="TREE_DOCUMENT" id="image3"/>
                                                </f:facet>
                                            </webuijsf:treeNode>
                                        </webuijsf:treeNode>
                                        <webuijsf:treeNode id="treeNode4" text="Flexi">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_DOCUMENT" id="image4"/>
                                            </f:facet>
                                        </webuijsf:treeNode>
                                    </webuijsf:tree>
                                </webuijsf:panelLayout>
                            </webuijsf:accordionTab>
                            <webuijsf:accordionTab id="accordionTab2" selected="true" title="Favorites">
                                <webuijsf:panelLayout id="layoutPanel3" style="width: 128px; height: 128px;">
                                    <webuijsf:tree id="tree2" style="left: 0px; top: 0px; position: absolute; width: 214px" text="Tree">
                                        <webuijsf:treeNode id="treeNode5" text="blanca2">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_DOCUMENT" id="image5"/>
                                            </f:facet>
                                        </webuijsf:treeNode>
                                    </webuijsf:tree>
                                </webuijsf:panelLayout>
                            </webuijsf:accordionTab>
                            <webuijsf:accordionTab contentHeight="200px" id="accordionTab3" selected="true" title="Settings">
                                <webuijsf:panelLayout id="layoutPanel4" style="width: 128px; height: 128px;">
                                    <webuijsf:tree id="tree3" style="left: 0px; top: 0px; position: absolute; width: 214px" text="Preferences">
                                        <webuijsf:treeNode expanded="true" id="treeNode6" text="Display">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_FOLDER" id="image6"/>
                                            </f:facet>
                                        </webuijsf:treeNode>
                                        <webuijsf:treeNode id="treeNode7" text="Login">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_DOCUMENT" id="image7"/>
                                            </f:facet>
                                        </webuijsf:treeNode>
                                        <webuijsf:treeNode id="treeNode8" text="Theme">
                                            <f:facet name="image">
                                                <webuijsf:image icon="TREE_DOCUMENT" id="image8"/>
                                            </f:facet>
                                        </webuijsf:treeNode>
                                    </webuijsf:tree>
                                </webuijsf:panelLayout>
                            </webuijsf:accordionTab>
                        </webuijsf:accordion>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
