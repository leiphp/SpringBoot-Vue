this is template test<br>
${name}

<#if sex==1>
    男
    <#elseif sex==2>
    女
    <#else>
    其他
</#if>
<#list userlist as user>
    ${user}
</#list>