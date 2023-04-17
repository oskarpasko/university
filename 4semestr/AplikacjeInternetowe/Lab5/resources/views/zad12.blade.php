@if ($name == null)
    Brak imienia
@elseif (str_starts_with($name, 'B'))
    Imie zaczyna się na B
@else
    Imie zaczyna się na inną literę
@endif
