<!doctype html>
<html lang="pl">

@include('shared.header')

<body>
    @include('shared.nav')

    <div class="container mt-5 mb-5">
        @if (session('error'))
            <div class="row d-flex justify-content-center">
                <div class="alert alert-danger">{{ session('error') }}</div>
            </div>
        @endif
        <div class="row mt-4 mb-4 text-center">
            <h1>Dodaj nowy kraj</h1>
        </div>

        @if ($errors->any())
            <div class="row d-flex justify-content-center">
                <div class="col-6">
                    <div class="alert alert-danger">
                        <ul>
                            @foreach ($errors->all() as $error)
                                <li>{{ $error }}</li>
                            @endforeach
                        </ul>
                    </div>
                </div>
            </div>
        @endif

        <div class="row d-flex justify-content-center">
            <div class="col-6">
                <form method="POST" action="{{ route('countries.store') }}" class="needs-validation" novalidate>
                    @csrf
                    <div class="form-group mb-2">
                        <label for="name">Nazwa</label>
                        <input id="name" name="name" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowe nazwa!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="code">Kod</label>
                        <input id="code" name="code" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowy kod!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="currency">Waluta</label>
                        <input id="currency" name="currency" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowa waluta!</div>
                    </div>
                    <div class="form-group mb-3">
                        <label for="area">Powierzchnia</label>
                        <div class="input-group mb-3">
                            <input id="area" type="number" name="area" min="0" placeholder="0"
                                step="any" class="form-control">
                            <span class="input-group-text"> km²</span>
                        </div>
                        <div class="invalid-feedback">Nieprawidłowa powierzchnia!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="language">Język</label>
                        <input id="language" name="language" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowy język!</div>
                    </div>
                    <div class="text-center mt-4 mb-4">
                        <input class="btn btn-success" type="submit" value="Wyślij">
                    </div>
                </form>
            </div>
        </div>
    </div>

    @include('shared.footer')
</body>

</html>
