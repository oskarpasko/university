<!doctype html>
<html lang="pl">

@include('shared.header')

<body>
    @include('shared.nav')

    <td scope="row">{{ $c->name }}</td>
    <td scope="row">{{ $c->code }}</td>
    <td scope="row">{{ $c->currency }}</td>
    <td scope="row">{{ $c->area }}</td>
    <td scope="row">{{ $c->language }}</td>

    @include('shared.footer')
</body>

</html>
