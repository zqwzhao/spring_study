<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="2">
        <tr>
            <td>编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>购买日期</td>
        </tr>
        <#list products as p>
        <tr>
            <td>${p.id}</td>
            <td>${p.pnane}</td>
            <td>${p.price}</td>
            <td>${p.date?string("yyyy-MM-dd HH:mm:ss")}</td>
        </tr>
        </#list>
    </table>
</body>
</html>